.class public final synthetic LE9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:Lr/a;


# direct methods
.method public synthetic constructor <init>(LT/q0;Lr/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE9/g;->a:LT/q0;

    iput-object p2, p0, LE9/g;->b:Lr/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LE9/g;->a:LT/q0;

    iget-object v1, p0, LE9/g;->b:Lr/a;

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Float;

    invoke-static {v0, v1, p1, p2}, LE9/l;->b(LT/q0;Lr/a;Ljava/lang/Float;Ljava/lang/Float;)LYg/J;

    move-result-object p1

    return-object p1
.end method
