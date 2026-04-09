.class public final synthetic LH8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LH8/b;


# direct methods
.method public synthetic constructor <init>(LH8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/a;->a:LH8/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/a;->a:LH8/b;

    check-cast p1, Ll9/a;

    invoke-static {v0, p1}, LH8/b;->p0(LH8/b;Ll9/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
