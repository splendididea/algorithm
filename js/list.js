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
    // this.clear = clear;
    // this.find = find;
    this.toString = toString;
    // this.insert = insert;
    this.append = append;
    this.remove = remove;
    // this.front = front;
    // this.end = end;
    // this.prev = prev;
    // this.next = next;
    this.length = length;
    // this.currPos = currPos;
    // this.moveTo = moveTo;
    // this.getElment = getElement;
    // this.contains = contains;
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


var names = new List();
names.append("Jay");
console.log(names.toString());

