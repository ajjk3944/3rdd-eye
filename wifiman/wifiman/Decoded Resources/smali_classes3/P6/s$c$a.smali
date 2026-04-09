.class LP6/s$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/s$c;->a(LG6/E$b;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/s$c;


# direct methods
.method constructor <init>(LP6/s$c;)V
    .locals 0

    iput-object p1, p0, LP6/s$c$a;->a:LP6/s$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)LG6/G$a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LG6/G$a;->READY:LG6/G$a;

    goto :goto_0

    :cond_0
    sget-object p1, LG6/G$a;->LOCATION_SERVICES_NOT_ENABLED:LG6/G$a;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LP6/s$c$a;->a(Ljava/lang/Boolean;)LG6/G$a;

    move-result-object p1

    return-object p1
.end method
