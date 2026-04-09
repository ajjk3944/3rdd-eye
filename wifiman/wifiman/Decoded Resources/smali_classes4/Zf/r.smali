.class public final synthetic LZf/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/r;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZf/r;->a:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Linet/ipaddr/m;->v(Ljava/util/ArrayList;I)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
