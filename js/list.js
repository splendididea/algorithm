/**
 * ch03 리스트 
 * ADT : 추상적 데이터 형 
 */

 // 3.1 리스트 ADT 
 /**
  *     리스트 ADT 
        listSize(프로퍼티)                      리스트의 요소 수 
        pos(프로퍼티)                           현재 위치
        length(프로퍼티)                        리스트의 요소 수 반환
        clear(함수)                            리스트의 모든 요소 삭제 
        toString(함수)                         리스트를 문자열로 표현해 반환
        getElement(함수)                       현재 위치의 요소를 반환
        insert(함수)                           기존 요소 위로 새 요소를 추가
        append(함수)                           새 요소를 리스트 끝에 추가
        remove(함수)                           리스트의 요소 삭제
        front(함수)                            현재 위치를 리스트 첫 번째 요소로 설정
        end(함수)                              현재 위치를 리스트 마지막 요소로 설정
        prev(함수)                             현재 위치를 한 요소 뒤로 이동 
        next(함수)                             현재 위치를 한 요소 앞으로 이동
        currPos(함수)                          리스트의 현재 위치 반환  
        moveTo(함수)                           현재 위치를 지정된 위치로 이동 
  
  */
function List() {
    this.listSize = 0;
    this.pos = 0;
    this.dataStore = []; // 리스트 요소를 저장할 빈 배열 초기화
    this.clear = clear;
    this.find = find;
    this.toString = toString;
    // this.insert = insert;
    this.append = append;
    this.remove = remove;
    this.front = front;
    this.end = end;
    // this.prev = prev;
    // this.next = next;
    this.length = length;
    // this.currPos = currPos;
    // this.moveTo = moveTo;
    this.getElement = getElement;
    this.contains = contains;
}


// 3.2.1 Append 
function append(element) {
    this.dataStore[this.listSize++] = element;
}
//3.2.2 Remove 
function find(element) {
    for(var i=0;i<this.dataStore.length;i++) {
        if( this.dataStore[i] == element  ){
            return i;
        }
    }
    return -1;
}

function remove(element) {
    var foundAt = this.find(element);
    if( foundAt > -1 ) {
        this.dataStore.splice(foundAt,1);
        --this.listSize;
        return true;
    }
    return false;
}

//3.2.4 Length 리스트 요소 개수 
function length() {
    return this.listSize;
}

//3.2.5 toString 리스트 요소 확인 
function toString(){
    return this.dataStore;
}

//3.2.6 Insert 
function insert(element, after) {
    var insertPos = find(after);
    if (insertPos > -1) {
        this.dataStore.splice(insertPos + 1, 0 , element);
        ++this.listSize;
        return true;
    }   
    return false;
}

// 3.2.7 
function clear() {
    // delete this.dataStore;
    this.dataStore = [];
    this.dataStore.length = 0;
    this.listSize = this.pos = 0;
}

var names = new List();
names.append("Jay");
names.append('Mike');
names.remove('Mike');
console.log(names.toString());

names.clear();
console.log(names.toString());
names.append("MIKA");
// 3.2.8 Contains 리스트에 특정값이 있는지 판단 
function contains ( element ) {
    for( var i=0; i<this.dataStore.length;i++ ){
        if( this.dataStore[i] == element ) {
            return true;
        } 
    }
    return false;
}

console.log( names.contains("MIKA") );

// 3.2.9 리스트 탐색 
function front() {
    this.pos = 0;
}

function end() {
    this.pos = this.listSize  -1;
}

function prev() {
    if( this.pos > 0 ){
        --this.pos;
    }
}

function next() {
    
}

function getElement() {
    return this.dataStore[this.pos];
}



var names2 = new List();
names2.append('MIKE');
names2.append('TALES');

names2.front();

console.log(names.getElement());

