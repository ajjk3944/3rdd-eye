.class public final synthetic LF9/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LH/l;


# direct methods
.method public synthetic constructor <init>(LH/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/V;->a:LH/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF9/V;->a:LH/l;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, LF9/X$a;->b(LH/l;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
