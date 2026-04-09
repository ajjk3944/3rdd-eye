.class public final synthetic Lorg/ocpsoft/prettytime/i18n/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lorg/ocpsoft/prettytime/i18n/Resources_fi;


# direct methods
.method public synthetic constructor <init>(Lorg/ocpsoft/prettytime/i18n/Resources_fi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/b;->a:Lorg/ocpsoft/prettytime/i18n/Resources_fi;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/b;->a:Lorg/ocpsoft/prettytime/i18n/Resources_fi;

    check-cast p1, LAj/g;

    invoke-static {v0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->b(Lorg/ocpsoft/prettytime/i18n/Resources_fi;LAj/g;)LAj/f;

    move-result-object p1

    return-object p1
.end method
