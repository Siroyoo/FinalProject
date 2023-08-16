package com.mycom.myapp.repository;

// Ctrl + Alt + O
//@SpringBootTest
//public class MemoRepositoryTests {
//
//    @Autowired
//    MemoRepository memoRepository;
//
//    @Test
//    public void testClass(){
//        System.out.println(memoRepository.getClass().getName()); // = sout + tab
//
//    }
//
//    @Test
//    public  void testInsertData(){
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            Memo memo = Memo.builder().memoText("Sample ... " + i).build();
//            memoRepository.save(memo);
//        });
//    }
//
//    @Test
//    public void testSelect(){
//        Long mno = 100L;
//
//        Optional<Memo> result = memoRepository.findById(mno);
//        // Null Pointer Exception(NPE)를 방지할수 있다
//        // try{ NPE가 발생할 수 있는 것들 }catch null
//        System.out.println("=================================================");
//
//        if(result.isPresent()) {
//            Memo memo = result.get();
//            System.out.println(memo);
//        }
//    }
//
//    @Transactional
//    @Test
//    public void testSelect2(){
//        Long mno = 100L;
//
//        Memo memo = memoRepository.getOne(mno);
//        System.out.println("===================================================");
//        System.out.println(memo);
//    }
//
//    @Test
//    public void testUpdate(){ // update
//        Memo memo = Memo.builder().mno(100L).memoText("Update text ....").build();
//        System.out.println(memoRepository.save(memo));
//    }
//
//    @Test
//    public void testDelete(){ // delete, EmptyResultDataAccessException
//        Long mno = 100L;
//
//        memoRepository.deleteById(mno);
//    }
//
//    @Test
//    public void testPageDefault(){
//        Pageable pageable = PageRequest.of(0, 10);
//
//        Page<Memo> result = memoRepository.findAll(pageable);
//
//        System.out.println(result);
//
//        System.out.println("====================================================================");
//
//        System.out.println("Total pages : " + result.getTotalPages()); // 총 페이지 수
//        System.out.println("Total count : " + result.getTotalElements()); // 전체 갯수
//        System.out.println("Page number : " + result.getNumber()); // 현제 페이지 번호
//        System.out.println("Page size : " + result.getSize()); // 페이지 당 데이터 갯수
//        System.out.println("has next page? : " + result.hasNext()); // 다음 페이지의 존재여부
//        System.out.println("first page? : " + result.isFirst()); // 시작페이지 (0) 여부0
//
//        System.out.println("----------------------------------------------------------------------");
//
//        for(Memo memo : result.getContent()){
//            System.out.println(memo);
//        }
//    }
//
//    @Test
//    public void testSort(){
//        Sort sort1 = Sort.by("mno").descending(); // order by mno desc;
//        Sort sort2 = Sort.by("memoText").ascending(); // order by mno aesc;
//        Sort sortAll = sort1.and(sort2);
//
//        Pageable pageable = PageRequest.of(0, 10, sortAll); // sort1과 sort2가 결합된 정렬 조건
//
//        Page<Memo> result = memoRepository.findAll(pageable);
//
//        result.get().forEach(memo -> {
//            System.out.println(memo);
//        });
//    }
//
//    @Test
//    public void testQueryMethods() {
//        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoDesc(70L, 80L);
//
//        for (Memo memo : list) {
//            System.out.println(memo);
//        }
//    }
//
//    @Test
//    public void testQueryMethodWithPageable() {
//
//        Pageable pageable = PageRequest.of(0, 10, Sort.by("mno").descending());
//
//        Page<Memo> result = memoRepository.findByMnoBetween(10L, 50L, pageable);
//
//        result.get().forEach(memo -> System.out.println(memo));
//    }
//
//    @Commit
//    @Transactional
//    @Test
//    public void testDeleteQueryMethods() {
//        memoRepository.deleteMemoByMnoLessThan(10L);
//    }
//}
