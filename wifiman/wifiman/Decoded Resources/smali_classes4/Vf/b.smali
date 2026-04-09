.class public final LVf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:I = 0x8


# instance fields
.field private final a:LVf/h;

.field private final b:LVf/d;

.field private final c:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LVf/h;LVf/d;Ll0/i;)V
    .locals 1

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVf/b;->a:LVf/h;

    iput-object p2, p0, LVf/b;->b:LVf/d;

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LVf/b;->c:LLi/z;

    return-void
.end method


# virtual methods
.method public final a()LLi/z;
    .locals 1

    iget-object v0, p0, LVf/b;->c:LLi/z;

    return-object v0
.end method

.method public final b()LVf/d;
    .locals 1

    iget-object v0, p0, LVf/b;->b:LVf/d;

    return-object v0
.end method

.method public final c()LVf/h;
    .locals 1

    iget-object v0, p0, LVf/b;->a:LVf/h;

    return-object v0
.end method

.method public final d(Ll0/i;)V
    .locals 1

    iget-object v0, p0, LVf/b;->c:LLi/z;

    invoke-interface {v0, p1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LVf/b;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LVf/b;

    iget-object v2, p0, LVf/b;->a:LVf/h;

    iget-object v3, p1, LVf/b;->a:LVf/h;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, LVf/b;->b:LVf/d;

    iget-object p1, p1, LVf/b;->b:LVf/d;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LVf/b;->a:LVf/h;

    invoke-virtual {v0}, LVf/h;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LVf/b;->b:LVf/d;

    invoke-virtual {v1}, LVf/d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
