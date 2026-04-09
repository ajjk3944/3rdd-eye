.class final Leb/c$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c$k;->c(Leb/m;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$k$a;

    invoke-direct {v0}, Leb/c$k$a;-><init>()V

    sput-object v0, Leb/c$k$a;->a:Leb/c$k$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/k;Lgb/l;)Lgb/k;
    .locals 1

    const-string/jumbo v0, "systemInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "systemInfoUpdate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lgb/k;->i(Lgb/l;)Lgb/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgb/k;

    check-cast p2, Lgb/l;

    invoke-virtual {p0, p1, p2}, Leb/c$k$a;->a(Lgb/k;Lgb/l;)Lgb/k;

    move-result-object p1

    return-object p1
.end method
