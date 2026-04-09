.class final Lcd/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcd/d;->a(Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcd/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/d$c;

    invoke-direct {v0}, Lcd/d$c;-><init>()V

    sput-object v0, Lcd/d$c;->a:Lcd/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/marsounjan/icmp4a/Icmp$Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcd/d$a$a;

    check-cast p1, Lcom/marsounjan/icmp4a/Icmp$Error;

    invoke-direct {v0, p1}, Lcd/d$a$a;-><init>(Lcom/marsounjan/icmp4a/Icmp$Error;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcd/d$c;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
