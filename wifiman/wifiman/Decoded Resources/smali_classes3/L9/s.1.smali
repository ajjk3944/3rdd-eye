.class public final synthetic LL9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:Lr/C;

.field public final synthetic b:LIi/N;


# direct methods
.method public synthetic constructor <init>(Lr/C;LIi/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/s;->a:Lr/C;

    iput-object p2, p0, LL9/s;->b:LIi/N;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LL9/s;->a:Lr/C;

    iget-object v1, p0, LL9/s;->b:LIi/N;

    check-cast p1, LC0/d;

    check-cast p2, LC0/B;

    check-cast p3, LY0/b;

    invoke-static {v0, v1, p1, p2, p3}, LL9/q$c$a$a;->a(Lr/C;LIi/N;LC0/d;LC0/B;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
