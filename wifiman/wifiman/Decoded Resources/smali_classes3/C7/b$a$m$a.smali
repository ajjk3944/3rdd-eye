.class final LC7/b$a$m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC7/b$a$m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$m$a;

    invoke-direct {v0}, LC7/b$a$m$a;-><init>()V

    sput-object v0, LC7/b$a$m$a;->a:LC7/b$a$m$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Lt7/g;
    .locals 3

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt7/g;

    sget-object v1, Lv7/b;->a:Lv7/b;

    sget-object v2, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v1, p1, v2}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, Lt7/g;-><init>(J)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LC7/b$a$m$a;->a([B)Lt7/g;

    move-result-object p1

    return-object p1
.end method
