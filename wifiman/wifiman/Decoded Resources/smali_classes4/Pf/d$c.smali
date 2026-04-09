.class final LPf/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf/d;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LPf/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LPf/d$c;

    invoke-direct {v0}, LPf/d$c;-><init>()V

    sput-object v0, LPf/d$c;->a:LPf/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LPf/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LPf/d$c;->c(LPf/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LPf/a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Status emission "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPf/a;

    invoke-virtual {p0, p1}, LPf/d$c;->b(LPf/a;)V

    return-void
.end method

.method public final b(LPf/a;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPf/f;

    invoke-direct {v0, p1}, LPf/f;-><init>(LPf/a;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
