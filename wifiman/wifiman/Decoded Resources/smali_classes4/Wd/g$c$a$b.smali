.class final LWd/g$c$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWd/g$c$a;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LWd/g$c$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LWd/g$c$a$b;

    invoke-direct {v0}, LWd/g$c$a$b;-><init>()V

    sput-object v0, LWd/g$c$a$b;->a:LWd/g$c$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWd/g$c$a$b$a;->a:LWd/g$c$a$b$a;

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LWd/g$c$a$b;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
