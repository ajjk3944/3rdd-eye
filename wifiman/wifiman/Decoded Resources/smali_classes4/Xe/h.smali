.class public final synthetic LXe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LXe/b;

.field public final synthetic b:LT/q0;


# direct methods
.method public synthetic constructor <init>(LXe/b;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXe/h;->a:LXe/b;

    iput-object p2, p0, LXe/h;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LXe/h;->a:LXe/b;

    iget-object v1, p0, LXe/h;->b:LT/q0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, LXe/e$b$a;->a(LXe/b;LT/q0;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
