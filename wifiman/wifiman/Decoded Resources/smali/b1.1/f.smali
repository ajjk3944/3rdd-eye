.class public final Lb1/f;
.super Lb1/x;
.source "SourceFile"


# instance fields
.field private final c:Ljava/lang/Object;

.field private final d:Lb1/i$c;

.field private final e:Lb1/i$c;

.field private final f:Lb1/i$b;

.field private final g:Lb1/i$c;

.field private final h:Lb1/i$c;

.field private final i:Lb1/i$b;

.field private final j:Lb1/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0, p1}, Lb1/x;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb1/f;->c:Ljava/lang/Object;

    new-instance p1, Lb1/i$c;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1, p0}, Lb1/i$c;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->d:Lb1/i$c;

    new-instance p1, Lb1/i$c;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lb1/i$c;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->e:Lb1/i$c;

    new-instance p1, Lb1/i$b;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v0, v1, p0}, Lb1/i$b;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->f:Lb1/i$b;

    new-instance p1, Lb1/i$c;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1, p0}, Lb1/i$c;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->g:Lb1/i$c;

    new-instance p1, Lb1/i$c;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, p0}, Lb1/i$c;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->h:Lb1/i$c;

    new-instance p1, Lb1/i$b;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v0, v1, p0}, Lb1/i$b;-><init>(Ljava/lang/Object;ILb1/x;)V

    iput-object p1, p0, Lb1/f;->i:Lb1/i$b;

    new-instance p1, Lb1/i$a;

    invoke-virtual {p0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Lb1/i$a;-><init>(Ljava/lang/Object;Lb1/x;)V

    iput-object p1, p0, Lb1/f;->j:Lb1/i$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/f;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lb1/i$a;
    .locals 1

    iget-object v0, p0, Lb1/f;->j:Lb1/i$a;

    return-object v0
.end method

.method public final c()Lb1/i$b;
    .locals 1

    iget-object v0, p0, Lb1/f;->i:Lb1/i$b;

    return-object v0
.end method

.method public final d()Lb1/i$c;
    .locals 1

    iget-object v0, p0, Lb1/f;->g:Lb1/i$c;

    return-object v0
.end method

.method public final e()Lb1/i$c;
    .locals 1

    iget-object v0, p0, Lb1/f;->d:Lb1/i$c;

    return-object v0
.end method

.method public final f()Lb1/i$b;
    .locals 1

    iget-object v0, p0, Lb1/f;->f:Lb1/i$b;

    return-object v0
.end method
