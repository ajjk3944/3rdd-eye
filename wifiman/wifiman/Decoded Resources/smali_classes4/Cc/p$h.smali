.class final LCc/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;-><init>(LOb/a;LDc/e;Lle/g;Lwc/h;Lcom/ui/wifiman/model/bluetooth/le/a;Lmc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCc/p$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCc/p$h;

    invoke-direct {v0}, LCc/p$h;-><init>()V

    sput-object v0, LCc/p$h;->a:LCc/p$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDc/j;

    new-instance v0, Ll9/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDc/j;->u()La8/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LCc/p$h;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
