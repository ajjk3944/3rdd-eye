.class public final synthetic LCd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LCd/l;


# direct methods
.method public synthetic constructor <init>(LCd/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCd/m;->a:LCd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LCd/m;->a:LCd/l;

    check-cast p1, LCd/n;

    invoke-static {v0, p1}, LCd/l$d;->k(LCd/l;LCd/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
