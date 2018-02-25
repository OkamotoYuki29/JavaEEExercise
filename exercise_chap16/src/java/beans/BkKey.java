package beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class BkKey implements Serializable {

    private String publisher;	// 出版社コード
    private String code;	// 書籍コード

    public BkKey() {
    }

    public BkKey(String publisher, String code) {
        this.publisher = publisher;
        this.code = code;
    }
    /*
     * NetBeansの機能でequalsメソッドとhashcodeメソッドを自動生成します。
     * 下の空白行（23行～）にカーソルを置き、メニューで次のようにしなさい
     * ①［ソース］→［コードを挿入］と選択
     * ②表示される選択肢から［equals()およびhashcode()...］を選ぶ
     * ③publisherとcodeにチェックを入れてから［生成］を押す
     */

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 89 * hash + Objects.hashCode(this.publisher);
		hash = 89 * hash + Objects.hashCode(this.code);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final BkKey other = (BkKey) obj;
		if (!Objects.equals(this.publisher, other.publisher)) {
			return false;
		}
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		return true;
	}
		
		
}
