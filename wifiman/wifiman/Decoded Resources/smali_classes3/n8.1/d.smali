.class public final synthetic Ln8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ln8/a;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ln8/a;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/d;->a:Ln8/a;

    iput-object p2, p0, Ln8/d;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln8/d;->a:Ln8/a;

    iget-object v1, p0, Ln8/d;->b:Ljava/util/Map;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, v1, p1}, Ln8/a$t;->a(Ln8/a;Ljava/util/Map;Ljava/util/Map$Entry;)LKe/a$h;

    move-result-object p1

    return-object p1
.end method
