.class final Lre/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/b;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lje/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/b$a;

    invoke-direct {v0}, Lre/b$a;-><init>()V

    sput-object v0, Lre/b$a;->a:Lre/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Ll9/a;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Ll9/a;

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lke/c;->b()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lje/r$b$b;

    if-nez v0, :cond_3

    instance-of p1, p1, Lje/r$a;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lre/b$a;->a(Lje/r;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
