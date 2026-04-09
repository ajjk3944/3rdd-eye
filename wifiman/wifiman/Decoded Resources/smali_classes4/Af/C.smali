.class public final synthetic LAf/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/C;->a:Lmh/l;

    iput-object p2, p0, LAf/C;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAf/C;->a:Lmh/l;

    iget-object v1, p0, LAf/C;->b:Ljava/util/Map;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, LAf/E;->b(Lmh/l;Ljava/util/Map;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
