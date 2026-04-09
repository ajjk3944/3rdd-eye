.class final LD3/o;
.super LD3/e;
.source "SourceFile"


# instance fields
.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I

.field private final transient f:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LD3/e;-><init>()V

    iput-object p1, p0, LD3/o;->d:[Ljava/lang/Object;

    iput p2, p0, LD3/o;->e:I

    iput p3, p0, LD3/o;->f:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LD3/o;->f:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LD3/P;->a(IILjava/lang/String;)I

    iget-object v0, p0, LD3/o;->d:[Ljava/lang/Object;

    add-int/2addr p1, p1

    iget v1, p0, LD3/o;->e:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LD3/o;->f:I

    return v0
.end method
