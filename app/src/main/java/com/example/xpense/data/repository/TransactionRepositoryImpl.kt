/**
 *
 *	MIT License
 *
 *	Copyright (c) 2023 Gautam Hazarika
 *
 *	Permission is hereby granted, free of charge, to any person obtaining a copy
 *	of this software and associated documentation files (the "Software"), to deal
 *	in the Software without restriction, including without limitation the rights
 *	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *	copies of the Software, and to permit persons to whom the Software is
 *	furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all
 *	copies or substantial portions of the Software.
 *
 *	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *	SOFTWARE.
 *
 **/

package com.example.xpense.data.repository

import com.example.xpense.data.data_source.TransactionDao
import com.example.xpense.domain.model.Transaction
import com.example.xpense.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class TransactionRepositoryImpl(
    private val dao: TransactionDao,
) : TransactionRepository {

    override suspend fun insert(transaction: Transaction) {
        dao.insertTransaction(transaction)
    }

    override suspend fun update(transaction: Transaction) {
        dao.updateTransaction(transaction)
    }

    override suspend fun getAllTransactions(): Flow<List<Transaction>> {
        return dao.getAllTransactions()
    }

    override suspend fun getTransactionById(id: Int): Flow<Transaction> {
       return dao.getTransactionById(id)
    }

    override suspend fun deleteTransactionById(id: Int) {
        dao.deleteTransactionById(id)
    }


}