.class public LN6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ6/e;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Landroid/util/SparseArray;

.field private final e:Ljava/util/Map;

.field private final f:I

.field private final g:Ljava/lang/String;

.field private final h:[B


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/v;->b:Ljava/util/List;

    iput-object p2, p0, LN6/v;->c:Ljava/util/List;

    iput-object p3, p0, LN6/v;->d:Landroid/util/SparseArray;

    iput-object p4, p0, LN6/v;->e:Ljava/util/Map;

    iput-object p7, p0, LN6/v;->g:Ljava/lang/String;

    iput p5, p0, LN6/v;->a:I

    iput p6, p0, LN6/v;->f:I

    iput-object p8, p0, LN6/v;->h:[B

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LN6/v;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, LN6/v;->h:[B

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LN6/v;->a:I

    return v0
.end method

.method public d(I)[B
    .locals 1

    iget-object v0, p0, LN6/v;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LN6/v;->c:Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LN6/v;->b:Ljava/util/List;

    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LN6/v;->e:Ljava/util/Map;

    return-object v0
.end method

.method public h(Landroid/os/ParcelUuid;)[B
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LN6/v;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method
