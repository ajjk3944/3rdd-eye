.class public final synthetic LD9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:LD9/o;

.field public final synthetic c:Lmh/a;


# direct methods
.method public synthetic constructor <init>(LT/q0;LD9/o;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/l;->a:LT/q0;

    iput-object p2, p0, LD9/l;->b:LD9/o;

    iput-object p3, p0, LD9/l;->c:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LD9/l;->a:LT/q0;

    iget-object v1, p0, LD9/l;->b:LD9/o;

    iget-object v2, p0, LD9/l;->c:Lmh/a;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, v2, p1}, LD9/k$b;->a(LT/q0;LD9/o;Lmh/a;F)LYg/J;

    move-result-object p1

    return-object p1
.end method
