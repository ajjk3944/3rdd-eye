.class public final synthetic LM8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:La8/a;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La8/a;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/l;->a:Ljava/util/List;

    iput-object p2, p0, LM8/l;->b:La8/a;

    iput-object p3, p0, LM8/l;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LM8/l;->a:Ljava/util/List;

    iget-object v1, p0, LM8/l;->b:La8/a;

    iget-object v2, p0, LM8/l;->c:Ljava/util/Map;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, LM8/r;->g(Ljava/util/List;La8/a;Ljava/util/Map;Ljava/util/List;)LYg/J;

    move-result-object p1

    return-object p1
.end method
