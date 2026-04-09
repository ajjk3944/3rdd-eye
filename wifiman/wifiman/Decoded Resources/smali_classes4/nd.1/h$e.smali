.class final Lnd/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h;-><init>(Landroid/content/Context;LWb/j;LCd/f;LCc/n;LZc/c;Lad/i;Lje/u;LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lnd/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnd/h$e;

    invoke-direct {v0}, Lnd/h$e;-><init>()V

    sput-object v0, Lnd/h$e;->a:Lnd/h$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWb/j;)LDj/a;
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LWb/j;->f()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWb/j;

    invoke-virtual {p0, p1}, Lnd/h$e;->a(LWb/j;)LDj/a;

    move-result-object p1

    return-object p1
.end method
