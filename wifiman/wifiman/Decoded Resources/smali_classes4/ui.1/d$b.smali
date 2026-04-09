.class public final Lui/d$b;
.super LZg/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private c:I

.field final synthetic d:Lui/d;


# direct methods
.method constructor <init>(Lui/d;)V
    .locals 0

    iput-object p1, p0, Lui/d$b;->d:Lui/d;

    invoke-direct {p0}, LZg/c;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lui/d$b;->c:I

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 2

    :cond_0
    iget v0, p0, Lui/d$b;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lui/d$b;->c:I

    iget-object v1, p0, Lui/d$b;->d:Lui/d;

    invoke-static {v1}, Lui/d;->f(Lui/d;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lui/d$b;->d:Lui/d;

    invoke-static {v0}, Lui/d;->f(Lui/d;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lui/d$b;->c:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    :cond_1
    iget v0, p0, Lui/d$b;->c:I

    iget-object v1, p0, Lui/d$b;->d:Lui/d;

    invoke-static {v1}, Lui/d;->f(Lui/d;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, LZg/c;->e()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lui/d$b;->d:Lui/d;

    invoke-static {v0}, Lui/d;->f(Lui/d;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lui/d$b;->c:I

    aget-object v0, v0, v1

    const-string v1, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LZg/c;->f(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
