.class public final synthetic LQe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQe/g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQe/g;->a:Ljava/lang/String;

    check-cast p1, Lc0/m;

    check-cast p2, LQe/b;

    invoke-static {v0, p1, p2}, LQe/i;->b(Ljava/lang/String;Lc0/m;LQe/b;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
