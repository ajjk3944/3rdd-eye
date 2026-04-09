.class final LOf/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOf/e;->d(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LOf/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LOf/e$a;

    invoke-direct {v0}, LOf/e$a;-><init>()V

    sput-object v0, LOf/e$a;->a:LOf/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LOf/e$a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Settings stream error"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LOf/e$a;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOf/d;

    invoke-direct {v0}, LOf/d;-><init>()V

    invoke-static {v0, p1}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method
