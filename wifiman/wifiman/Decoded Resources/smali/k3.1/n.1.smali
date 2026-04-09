.class public final synthetic Lk3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk3/M$b;


# instance fields
.field public final synthetic a:Lk3/M;

.field public final synthetic b:Lc3/p;


# direct methods
.method public synthetic constructor <init>(Lk3/M;Lc3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/n;->a:Lk3/M;

    iput-object p2, p0, Lk3/n;->b:Lc3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk3/n;->a:Lk3/M;

    iget-object v1, p0, Lk3/n;->b:Lc3/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lk3/M;->S(Lk3/M;Lc3/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
