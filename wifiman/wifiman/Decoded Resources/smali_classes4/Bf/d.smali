.class public final synthetic LBf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LLi/z;

.field public final synthetic b:LBf/b;

.field public final synthetic c:LBf/b;


# direct methods
.method public synthetic constructor <init>(LLi/z;LBf/b;LBf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBf/d;->a:LLi/z;

    iput-object p2, p0, LBf/d;->b:LBf/b;

    iput-object p3, p0, LBf/d;->c:LBf/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LBf/d;->a:LLi/z;

    iget-object v1, p0, LBf/d;->b:LBf/b;

    iget-object v2, p0, LBf/d;->c:LBf/b;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LBf/e$a;->n(LLi/z;LBf/b;LBf/b;FF)LYg/J;

    move-result-object p1

    return-object p1
.end method
