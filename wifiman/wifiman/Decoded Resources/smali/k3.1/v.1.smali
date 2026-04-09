.class public final synthetic Lk3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk3/M$b;


# instance fields
.field public final synthetic a:Lk3/M;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lc3/p;


# direct methods
.method public synthetic constructor <init>(Lk3/M;Ljava/util/List;Lc3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/v;->a:Lk3/M;

    iput-object p2, p0, Lk3/v;->b:Ljava/util/List;

    iput-object p3, p0, Lk3/v;->c:Lc3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk3/v;->a:Lk3/M;

    iget-object v1, p0, Lk3/v;->b:Ljava/util/List;

    iget-object v2, p0, Lk3/v;->c:Lc3/p;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk3/M;->t0(Lk3/M;Ljava/util/List;Lc3/p;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
