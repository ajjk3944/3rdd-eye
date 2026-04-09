.class public final synthetic LAj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:LAj/e;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LAj/e;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAj/c;->a:LAj/e;

    iput-object p2, p0, LAj/c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LAj/c;->a:LAj/e;

    iget-object v1, p0, LAj/c;->b:Ljava/util/Map;

    check-cast p1, LAj/g;

    invoke-static {v0, v1, p1}, LAj/e;->a(LAj/e;Ljava/util/Map;LAj/g;)V

    return-void
.end method
