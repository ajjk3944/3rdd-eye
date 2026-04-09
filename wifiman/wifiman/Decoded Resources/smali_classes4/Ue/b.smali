.class public final synthetic LUe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/Long;

.field public final synthetic b:Lmh/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe/b;->a:Ljava/lang/Long;

    iput-object p2, p0, LUe/b;->b:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LUe/b;->a:Ljava/lang/Long;

    iget-object v1, p0, LUe/b;->b:Lmh/a;

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-static {v0, v1, p1, p2}, LUe/f;->d(Ljava/lang/Long;Lmh/a;LC0/U;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
