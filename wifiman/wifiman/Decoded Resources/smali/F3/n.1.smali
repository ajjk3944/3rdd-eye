.class final LF3/n;
.super LF3/h;
.source "SourceFile"


# static fields
.field static final f:LF3/h;


# instance fields
.field final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF3/n;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, LF3/n;-><init>([Ljava/lang/Object;I)V

    sput-object v0, LF3/n;->f:LF3/h;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, LF3/h;-><init>()V

    iput-object p1, p0, LF3/n;->d:[Ljava/lang/Object;

    iput p2, p0, LF3/n;->e:I

    return-void
.end method


# virtual methods
.method final g([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, LF3/n;->d:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, LF3/n;->e:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LF3/n;->e:I

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LF3/n;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LF3/x;->a(IILjava/lang/String;)I

    iget-object v0, p0, LF3/n;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method final j()I
    .locals 1

    iget v0, p0, LF3/n;->e:I

    return v0
.end method

.method final m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF3/n;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LF3/n;->e:I

    return v0
.end method
