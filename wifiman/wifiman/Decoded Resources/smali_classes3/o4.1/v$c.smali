.class public final Lo4/v$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private final c:[B

.field private final d:LA4/z;

.field private final e:LA4/I;

.field private final f:I

.field private final g:Ljava/lang/String;

.field private final h:Lo4/g;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[BLA4/z;LA4/I;ILjava/lang/String;Lo4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/v$c;->a:Ljava/lang/Object;

    iput-object p2, p0, Lo4/v$c;->b:Ljava/lang/Object;

    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lo4/v$c;->c:[B

    iput-object p4, p0, Lo4/v$c;->d:LA4/z;

    iput-object p5, p0, Lo4/v$c;->e:LA4/I;

    iput p6, p0, Lo4/v$c;->f:I

    iput-object p7, p0, Lo4/v$c;->g:Ljava/lang/String;

    iput-object p8, p0, Lo4/v$c;->h:Lo4/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()[B
    .locals 2

    iget-object v0, p0, Lo4/v$c;->c:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public c()Lo4/g;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->h:Lo4/g;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lo4/v$c;->f:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public f()LA4/I;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->e:LA4/I;

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public h()LA4/z;
    .locals 1

    iget-object v0, p0, Lo4/v$c;->d:LA4/z;

    return-object v0
.end method
