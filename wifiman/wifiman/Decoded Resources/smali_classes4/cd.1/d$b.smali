.class final Lcd/d$b;
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
.field public static final a:Lcd/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/d$b;

    invoke-direct {v0}, Lcd/d$b;-><init>()V

    sput-object v0, Lcd/d$b;->a:Lcd/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/marsounjan/icmp4a/Icmp$d;)Lcd/d$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd/d$a$b;

    invoke-direct {v0, p1}, Lcd/d$a$b;-><init>(Lcom/marsounjan/icmp4a/Icmp$d;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/marsounjan/icmp4a/Icmp$d;

    invoke-virtual {p0, p1}, Lcd/d$b;->a(Lcom/marsounjan/icmp4a/Icmp$d;)Lcd/d$a;

    move-result-object p1

    return-object p1
.end method
