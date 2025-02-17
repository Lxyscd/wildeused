package com.xy.mianshiya.model.dto.questionBankQuestion;

import lombok.Data;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.Serializable;
import java.util.List;

/**
 * 批量创建题库题目关联请求
 *

 */
@Data

public class QuestionBankQuestionBatchAddRequest implements Serializable {

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private List<Long> questionIdList;
   // public List<Long> getQuestionIdList() {}

    private static final long serialVersionUID = 1L;
}