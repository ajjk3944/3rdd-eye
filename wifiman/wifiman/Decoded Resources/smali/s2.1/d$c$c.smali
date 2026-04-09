.class public final Ls2/d$c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls2/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls2/d$c$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls2/d$b;Landroid/database/sqlite/SQLiteDatabase;)Ls2/c;
    .locals 2

    const-string v0, "refHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sqLiteDatabase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls2/d$b;->a()Ls2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Ls2/c;->h(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v0, Ls2/c;

    invoke-direct {v0, p2}, Ls2/c;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p1, v0}, Ls2/d$b;->b(Ls2/c;)V

    :cond_1
    return-object v0
.end method
