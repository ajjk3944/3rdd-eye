.class public final LF1/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lw1/f;

.field private final b:Lw1/f;


# direct methods
.method private constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, LF1/j0$d;->g(Landroid/view/WindowInsetsAnimation$Bounds;)Lw1/f;

    move-result-object v0

    iput-object v0, p0, LF1/j0$a;->a:Lw1/f;

    .line 6
    invoke-static {p1}, LF1/j0$d;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Lw1/f;

    move-result-object p1

    iput-object p1, p0, LF1/j0$a;->b:Lw1/f;

    return-void
.end method

.method public constructor <init>(Lw1/f;Lw1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LF1/j0$a;->a:Lw1/f;

    .line 3
    iput-object p2, p0, LF1/j0$a;->b:Lw1/f;

    return-void
.end method

.method public static d(Landroid/view/WindowInsetsAnimation$Bounds;)LF1/j0$a;
    .locals 1

    new-instance v0, LF1/j0$a;

    invoke-direct {v0, p0}, LF1/j0$a;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    return-object v0
.end method


# virtual methods
.method public a()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/j0$a;->a:Lw1/f;

    return-object v0
.end method

.method public b()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/j0$a;->b:Lw1/f;

    return-object v0
.end method

.method public c()Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1

    invoke-static {p0}, LF1/j0$d;->e(LF1/j0$a;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bounds{lower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF1/j0$a;->a:Lw1/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF1/j0$a;->b:Lw1/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
