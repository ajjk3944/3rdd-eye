.class final LO8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8/c;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lhc/b;LP8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LO8/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO8/c$b;

    invoke-direct {v0}, LO8/c$b;-><init>()V

    sput-object v0, LO8/c$b;->a:LO8/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/f$b;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "popupState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LP8/f$b$b;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    instance-of p1, p1, LP8/f$b$a;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP8/f$b;

    invoke-virtual {p0, p1}, LO8/c$b;->a(LP8/f$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
