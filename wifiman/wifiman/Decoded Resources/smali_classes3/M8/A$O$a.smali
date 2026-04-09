.class final LM8/A$O$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A$O;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/A$O$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/A$O$a;

    invoke-direct {v0}, LM8/A$O$a;-><init>()V

    sput-object v0, LM8/A$O$a;->a:LM8/A$O$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LPf/a;)LAf/H$a;
    .locals 2

    const-string/jumbo v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LAf/H$a;

    invoke-virtual {p1}, LPf/a;->a()LPf/a$a;

    move-result-object v1

    invoke-virtual {v1}, LPf/a$a;->a()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, LPf/a;->a()LPf/a$a;

    move-result-object p1

    invoke-virtual {p1}, LPf/a$a;->b()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, v1, p1}, LAf/H$a;-><init>(Ljava/lang/Float;Z)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPf/a;

    invoke-virtual {p0, p1}, LM8/A$O$a;->a(LPf/a;)LAf/H$a;

    move-result-object p1

    return-object p1
.end method
