.class final LJ7/n$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/n;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/n$b;

    invoke-direct {v0}, LJ7/n$b;-><init>()V

    sput-object v0, LJ7/n$b;->a:LJ7/n$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LY6/r;
    .locals 2

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    new-instance v1, Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValueAdapter;

    invoke-direct {v1}, Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValueAdapter;-><init>()V

    invoke-virtual {v0, v1}, LY6/r$a;->b(Ljava/lang/Object;)LY6/r$a;

    move-result-object v0

    sget-object v1, LK7/b;->a:LK7/b$a;

    invoke-virtual {v1}, LK7/b$a;->a()LZ6/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LY6/r$a;->a(LY6/h$d;)LY6/r$a;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/cloud/api/a;->a:Lcom/ubnt/teleport/unifi/cloud/api/a$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/api/a$a;->a()LZ6/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LY6/r$a;->a(LY6/h$d;)LY6/r$a;

    move-result-object v0

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ7/n$b;->a()LY6/r;

    move-result-object v0

    return-object v0
.end method
