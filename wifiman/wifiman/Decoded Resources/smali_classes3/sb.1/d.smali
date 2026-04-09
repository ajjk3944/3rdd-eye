.class public final synthetic Lsb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lokhttp3/Headers;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/Headers;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsb/d;->a:Lokhttp3/Headers;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsb/d;->a:Lokhttp3/Headers;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lsb/f;->b(Lokhttp3/Headers;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
