.class public final synthetic LGe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LCi/c;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LCi/c;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGe/h;->a:LCi/c;

    iput-object p2, p0, LGe/h;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LGe/h;->a:LCi/c;

    iget-object v1, p0, LGe/h;->b:Lmh/l;

    check-cast p1, LA/y;

    invoke-static {v0, v1, p1}, LGe/l;->c(LCi/c;Lmh/l;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
