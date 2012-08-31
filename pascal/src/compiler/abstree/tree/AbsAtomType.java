package compiler.abstree.tree;

import compiler.abstree.AbsVisitor;

/**
 * Izrazi za opis tipov: atomarni tipi.
 */
public class AbsAtomType extends AbsTypeExpr {

	public static final int BOOL = 0;
	public static final int CHAR = 1;
	public static final int INT = 2;

	/* Tip. */
	public int type;

    public boolean single;

	public AbsAtomType(int type) {
		this.type = type;
                this.single = false;
	}

    public AbsAtomType(int type, boolean single) {
        this.type = type;
        this.single = single;
	}


	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
