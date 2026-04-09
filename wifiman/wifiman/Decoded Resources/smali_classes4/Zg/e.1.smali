.class public final synthetic LZg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LZg/f;


# direct methods
.method public synthetic constructor <init>(LZg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZg/e;->a:LZg/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZg/e;->a:LZg/f;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, LZg/f;->d(LZg/f;Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
