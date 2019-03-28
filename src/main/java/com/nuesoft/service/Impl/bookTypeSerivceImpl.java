package com.nuesoft.service.Impl;

import com.nuesoft.dao.BookTypeMapper;
import com.nuesoft.po.BookType;
import com.nuesoft.po.BookTypeExample;
import com.nuesoft.service.bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class bookTypeSerivceImpl implements bookTypeService {
    @Autowired
    private BookTypeMapper bookTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer typeId) {
        return bookTypeMapper.deleteByPrimaryKey(typeId);
    }

    @Override
    public int insert(BookType record) {
        return bookTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(BookType record) {
        return bookTypeMapper.insertSelective(record);
    }

    @Override
    public List<BookType> selectByExample(BookTypeExample example) {
        return bookTypeMapper.selectByExample(example);
    }

    @Override
    public BookType selectByPrimaryKey(Integer typeId) {
        return bookTypeMapper.selectByPrimaryKey(typeId);
    }

    @Override
    public int updateByPrimaryKeySelective(BookType record) {
        return bookTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BookType record) {
        return bookTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BookType> selectAll() {
        return bookTypeMapper.selectAll();
    }
}
