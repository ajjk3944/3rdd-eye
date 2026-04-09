.class public final synthetic LJe/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:LJe/n;


# direct methods
.method public synthetic constructor <init>(LT/q0;LJe/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJe/r;->a:LT/q0;

    iput-object p2, p0, LJe/r;->b:LJe/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LJe/r;->a:LT/q0;

    iget-object v1, p0, LJe/r;->b:LJe/n;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, LJe/q$b$a;->a(LT/q0;LJe/n;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
