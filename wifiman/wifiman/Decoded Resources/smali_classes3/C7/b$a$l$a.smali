.class final LC7/b$a$l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC7/b$a$l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$l$a;

    invoke-direct {v0}, LC7/b$a$l$a;-><init>()V

    sput-object v0, LC7/b$a$l$a;->a:LC7/b$a$l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Lt7/f;
    .locals 10

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt7/f;

    sget-object v7, LC7/b$a$l$a$a;->a:LC7/b$a$l$a$a;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, LZg/n;->D0([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt7/f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LC7/b$a$l$a;->a([B)Lt7/f;

    move-result-object p1

    return-object p1
.end method
