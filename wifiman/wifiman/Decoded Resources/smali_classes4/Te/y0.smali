.class public final synthetic LTe/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/y0;->a:Ljava/util/Map;

    iput-object p2, p0, LTe/y0;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LTe/y0;->a:Ljava/util/Map;

    iget-object v1, p0, LTe/y0;->b:Lmh/l;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, LTe/A0;->a(Ljava/util/Map;Lmh/l;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
