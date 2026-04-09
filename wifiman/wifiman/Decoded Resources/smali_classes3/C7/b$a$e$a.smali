.class final LC7/b$a$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC7/b$a$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$e$a;

    invoke-direct {v0}, LC7/b$a$e$a;-><init>()V

    sput-object v0, LC7/b$a$e$a;->a:LC7/b$a$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Lt7/c;
    .locals 5

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LC7/b$a$e;->a:LC7/b$a$e;

    :try_start_0
    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance v0, Ljava/util/UUID;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, LYg/u;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Ljava/util/UUID;

    new-instance v0, Lt7/c;

    invoke-direct {v0, p1}, Lt7/c;-><init>(Ljava/util/UUID;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LC7/b$a$e$a;->a([B)Lt7/c;

    move-result-object p1

    return-object p1
.end method
