.class public interface abstract annotation Lc5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lc5/d;
        intEncoding = .enum Lc5/d$a;->DEFAULT:Lc5/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc5/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lc5/d$a;
.end method

.method public abstract tag()I
.end method
