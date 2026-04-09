.class public final synthetic Ltb/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lkb/o;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ltb/u;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/r;->a:Lkb/o;

    iput-object p2, p0, Ltb/r;->b:Ljava/lang/String;

    iput-object p3, p0, Ltb/r;->c:Ltb/u;

    iput-object p4, p0, Ltb/r;->d:Ljava/lang/String;

    iput-object p5, p0, Ltb/r;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ltb/r;->a:Lkb/o;

    iget-object v1, p0, Ltb/r;->b:Ljava/lang/String;

    iget-object v2, p0, Ltb/r;->c:Ltb/u;

    iget-object v3, p0, Ltb/r;->d:Ljava/lang/String;

    iget-object v4, p0, Ltb/r;->e:Ljava/util/Map;

    move-object v5, p1

    check-cast v5, Ltb/q;

    invoke-static/range {v0 .. v5}, Ltb/u;->c(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;Ltb/q;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
