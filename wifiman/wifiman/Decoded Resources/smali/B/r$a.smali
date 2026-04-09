.class final LB/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private c:I

.field private d:Lmh/p;

.field final synthetic e:LB/r;


# direct methods
.method public constructor <init>(LB/r;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LB/r$a;->e:LB/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LB/r$a;->a:Ljava/lang/Object;

    iput-object p4, p0, LB/r$a;->b:Ljava/lang/Object;

    iput p2, p0, LB/r$a;->c:I

    return-void
.end method

.method public static final synthetic a(LB/r$a;I)V
    .locals 0

    iput p1, p0, LB/r$a;->c:I

    return-void
.end method

.method public static final synthetic b(LB/r$a;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LB/r$a;->d:Lmh/p;

    return-void
.end method

.method private final c()Lmh/p;
    .locals 3

    new-instance v0, LB/r$a$a;

    iget-object v1, p0, LB/r$a;->e:LB/r;

    invoke-direct {v0, v1, p0}, LB/r$a$a;-><init>(LB/r;LB/r$a;)V

    const v1, 0x53af4291

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()Lmh/p;
    .locals 1

    iget-object v0, p0, LB/r$a;->d:Lmh/p;

    if-nez v0, :cond_0

    invoke-direct {p0}, LB/r$a;->c()Lmh/p;

    move-result-object v0

    iput-object v0, p0, LB/r$a;->d:Lmh/p;

    :cond_0
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB/r$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LB/r$a;->c:I

    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB/r$a;->a:Ljava/lang/Object;

    return-object v0
.end method
